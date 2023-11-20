import java.util.Random;

public class LF {
    
    public double LFstep(){
        double levyStep = 0;
        double Pthreshold =  0;
        double A = 9.5;
        levyStep = getStep(A, Pthreshold);
        return levyStep;
    }
    public double getStep(double A, double Pthreshold){
        double Plevy = new Random().nextDouble();
        double P = new Random().nextInt();
        double Snew=1;
        double S=0;

        if(Plevy>=Pthreshold){
            S = ( 1 / A ) * (( 1- Pthreshold ) / ( 1 - Plevy ));
		if( S < 1 ){
			S = 1;
		}
        System.out.println(S);
        
        if(P<0.5){
            Snew = -S;
        }else{
            Snew = S;
        }
        }
        return Snew;
    }
}