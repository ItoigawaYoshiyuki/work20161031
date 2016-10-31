package combination;
public class Combination_lib {
	
		  
 public int getFaction(int n){
  int f=1;//ŠKã‚Ì’l
  for(int i=n;i>=0;i--){
	 if(i==0)f*=1;
	 else f*=i;
 }
 return f;
}
}
