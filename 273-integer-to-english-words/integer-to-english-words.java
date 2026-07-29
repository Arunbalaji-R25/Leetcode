class Solution {
    public String numberToWords(int num){
        if(num == 0){
            return "Zero";
        }
        String[] big = new String[]{"Thousand","Million","Billion"};
        String res = helper(num%1000);
        num = num/1000;
        if(num>0 && num%1000>0){
            res = helper(num%1000)+"Thousand "+res;
        }
        num = num/1000;
        if(num>0 && num%1000>0){
            res = helper(num%1000)+"Million "+res;
        }
        num = num/1000;
        if(num>0){
            res = helper(num%1000)+"Billion "+res;
        }
        return res.trim();
    }
    public String helper(int num) {
        String[] digStr = new String[]{"Zero","One","Two","Three","Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teenStr = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen","Eighteen", "Nineteen"};
        String[] tenStr = new String[]{"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String res = "";
        if(num > 99){
            res += digStr[num/100]+" Hundred ";
        }
        num = num%100;
        if(num<20 && num>9){
            res += teenStr[num%10]+" ";
        }else{
            if(num>19){
                res += tenStr[num/10]+" ";
            }
            num = num%10;
            if(num>0){
                res += digStr[num]+" ";
            }
        }
        return res;
    }
}