class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String[] months= {"31","28", "31","30","31","30","31","31","30","31","30","31"};
        int [] days=new int[13];

        for (int i=1;i<13;i++){
            days[i]=Integer.parseInt(months[i-1]);
        }
        int a1 = convert(arriveAlice, days);
        int a2 = convert(leaveAlice, days); 
        int b1 = convert(arriveBob, days); 
        int b2 = convert(leaveBob, days);
        
        int start = Math.max(a1, b1);
        int end = Math.min(a2, b2);

        return Math.max(0,end-start+1);
    }

    public int convert(String date,int[] days){
        String[] s=date.split("-");
        int month=Integer.parseInt(s[0]);
        int day=Integer.parseInt(s[1]);

        int total=day;
        for (int i=1;i<month;i++){
            total+=days[i];
        }
        return total;

    }
}