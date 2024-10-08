package vgu.dz.sixth;


import static vgu.dz.myfuncs.MyMath.supFactorial;

public class Series {
    public int n;
    public double e;
    public double ediv10;
    public double last = 0;
    public double sumAllElements = 0;
    public double sumElementsBiggerThanE = 0;
    public double sumElementsBiggerThanEdiv10 = 0;
    public Series(int n, double e){
        this.n = n;
        this.e = e;
        this.ediv10 = this.e/10;
    }
    public void sumN(){
        for (int i = 0; i < this.n ; i++){
            this.last = nElem(i,this.last,0);
            this.sumAllElements += this.last;
            if (this.last > this.e){
                this.sumElementsBiggerThanE += this.last;
            }
            if (this.last > this.ediv10){
                this.sumElementsBiggerThanEdiv10 += this.last;
            }
        }
    }
    public double nElem(int n, double Anm1, int x){
        return Anm1 + Math.pow(-1,n)*supFactorial(n,1)/supFactorial(n,2);
    }
}
