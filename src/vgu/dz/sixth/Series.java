package vgu.dz.sixth;


import static vgu.dz.myfuncs.MyMath.supFactorial;

public class Series {
    public double x;
    public int n;
    public double e;
    public double ediv10;
    public double last = 0;
    private double sumAllElements = 0;
    private double sumElementsBiggerThanE = 0;
    private double sumElementsBiggerThanEdiv10 = 0;
    public Series(int n, double e,double x){
        this.n = n;
        this.x = x;
        this.e = e;
        this.ediv10 = this.e/10;
    }
    public void sumN(){
        for (int i = 0; i < this.n ; i++){
            this.last = nElem(i,this.last,this.x);
            this.sumAllElements += this.last;
            if (this.last > this.e){
                this.sumElementsBiggerThanE += this.last;
            }
            if (this.last > this.ediv10){
                this.sumElementsBiggerThanEdiv10 += this.last;
            }
        }
    }
    public double nElem(int n, double Anm1, double x){
        return Anm1 + x*Math.pow(-1,n)*supFactorial(n,1)/supFactorial(n,2);
    }
    public double getSumAllElements(){
        return this.sumAllElements;
    }
    public double getSumElementsBiggerThanE(){
        return this.sumElementsBiggerThanE;
    }
    public double getSumElementsBiggerThanEdiv10(){
        return this.sumElementsBiggerThanEdiv10;
    }
}
