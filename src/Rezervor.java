
public class Rezervor {
         float capMaxima;
         float capDeUmplere;
         
         public float getCapMaxima() {
			   return capMaxima;
		   }
		   
		   public void setCapMaxima(float capMaxima) {
			    this.capMaxima = capMaxima; 
		   }
		   
		   
		   
		   public float getCapDeUmplere() {
			   return capDeUmplere;
		   }
		   
		   public void setCapDeUmplere(float capDeUmplere) {
			    this.capDeUmplere = capDeUmplere; 
		   }
		   
		   public Rezervor (float capMaxima, float capDeUmplere) {
			   this.capDeUmplere = capDeUmplere;
			   this.capMaxima = capMaxima;
		   }
		   
		   public void umplere(float delta) {
			   capDeUmplere = capDeUmplere + delta;
			   if (capDeUmplere >= capMaxima) {
				   capDeUmplere = capMaxima;
			   }
		   }
		   
		   public void golire(float delta) {
			   capDeUmplere = capDeUmplere - delta;
			   if (capDeUmplere <= 0) {
				   capDeUmplere = 0;
			   }
		   }
}



		