#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#define mn 10005
char s[mn][5][21];
char bld[mn];
int sl=0;
int main()
{
    while (1)
    {
        scanf("%s",s[sl][0]);
       // printf("%s\n",s[sl][0]);
        if(strcmp(s[sl][0],"$")==0)break;
        scanf("%s",s[sl][1]);
        //printf("%s\n",s[sl][1]);
        scanf("%s",s[sl][2]);
        //printf("%s\n",s[sl][2]);
        scanf("%s",s[sl][3]);
        //printf("%s\n",s[sl][3]);
        scanf("%s",bld[sl]);
        //printf("%s",bld[sl]);
        getchar();
        sl++;
    }
    int res=0;
    for(int i=0;i<sl;i++)
    {
        int day=(s[i][0][0]-'0')*10+s[i][0][1]-'0';
        int month=(s[i][0][3]-'0')*10+s[i][0][4]-'0';
        if(month<1||month>12)continue;
        if(day<1||day>31)continue;
        if(month==2)
        {
            if(day>28)continue;
        }
        if(month==4||month==6||month==9||month==11)
        {
            if(day==31)continue;
        }
        res++;
    }
    printf("%d\n",res);
    double resmax=0;
    char stres[21]="";
    for(int i=0;i<sl;i++)
    {
        char st[21];
        strncpy(st,s[i][2],strlen(s[i][2])-1);
        double dores=atof(st);
        char cuoi=s[i][2][strlen(s[i][2])-1];
        if(cuoi=='M')dores=dores*1024;
        if(cuoi=='G')dores=dores*1024*1024;
        if(resmax<dores)
        {
            strcpy(stres,s[i][2]);
            resmax=dores;
        }
    }
    printf("%s\n",stres);
    return 0;
}