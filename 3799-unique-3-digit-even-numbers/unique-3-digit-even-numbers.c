int totalNumbers(int* digits, int digitsSize) {
     int count=0;
        int h[1000] = {0};
        for (int i=0;i<digitsSize;i++){
                if(digits[i]==0)continue;
            for (int j=0;j<digitsSize;j++){
                if(i==j)continue;
                for(int k=0;k<digitsSize;k++){
                    if(k==i || k==j)continue;
                    if(digits[k]%2!=0)continue;
                    int num=digits[i]*100 +digits[j]*10+digits[k];
                
                if(!h[num]){
                    h[num]=true;
                    count++;
                }
                }
            }
        }
        return count;
}