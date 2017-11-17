

package chain;

public class test implements InterfaceFraction(){
    private Integer a;
    private Integer b;
    
    public fractionadt(Integer a, Integer b){
        this.a=a;
        this.b=b;
    }
    
    public int getNumrtr(){
        return a;
    }
    
    public int setNumrtr(int a){
        this.a=a;
    }
    
    public int getDeno(){
        return b;
    }
    
    public int setDeno(int b){
        this.b=b;
    }
    
    public String Calc (char operand, Integer a, Integer b){
        String ans="";
        switch(operand){
            case'+':
                ans += a+ "/" +b + "/" + c+ "/" + d + "=" + a*d + "/" + b*c;
                break;
                
            case'-':
                ans += 
                break;
                
            case'*':
                
                break;
                
            case'/':
                
                break;
        }
        return ans;
    }
    
    public int getn();
    public void setn(int a);
    public int getd();
    public void getd(int b);
}



public class test {
    
}
