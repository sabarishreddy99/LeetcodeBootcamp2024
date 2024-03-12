class Solution {
    public static boolean isStringNumeric(String number)
    {
        boolean isNumeric;
        if(number == null)
            isNumeric = false;
        else
        {
            try
            {
                Integer num = Integer.parseInt(number);
                isNumeric = true;
            }
            catch(NumberFormatException e)
            {
                isNumeric = false;
            }
        }
        return isNumeric;
    }
    public int myAtoi(String s) {

        int wordflag = 0;
        Double finalNumber =0.0;
        int len = 0;
        String symbol="+";
        int symbcount=0;
        boolean numericstart = false;

        while(len<s.length() && wordflag==0){
            String current = s.substring(len,len+1);
               if(current.equals(" ") && !numericstart){
                //    System.out.println("Space");
                if(symbcount>=1){
                    break;
                }
                   len++;
                   continue;
               }
               if((current.equals("+") || current.equals("-")) && !numericstart){
                   symbol=current;
                   symbcount+=1;
                //    System.out.println(current);
                   len++;
                   continue;
               }
               if(isStringNumeric(current) && wordflag==0 && symbcount<=1){
                //    System.out.println("linr 45");
                   numericstart=true;
                   finalNumber*=10;
                   finalNumber+=Double.parseDouble(current);
                   finalNumber= (Double)Math.min(finalNumber,Math.pow(2,31));
                   System.out.println("49  " + finalNumber);
                   len++;

               }else{
                   wordflag=1;
                   break;
               }




        }

        System.out.println(symbol);
        // return -1;

        if(symbol.equals("-")){
            return (int)Math.max(finalNumber*-1, Math.pow(-2,31));
        }
        
       return (int)Math.min(finalNumber, Math.pow(2,31)-1);
    
    
    }
}
