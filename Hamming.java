public class Hamming {
    private String leftStrand;
	private String rightStrand;
    
    public Hamming(String leftStrand, String rightStrand) {
		if(leftStrand.length() != rightStrand.length()&&
          leftStrand.length() != 0 && rightStrand.length() != 0) {
			throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
		}
        if((leftStrand.length() == 0 || leftStrand.isEmpty())&&
           (leftStrand.length() != rightStrand.length())){
            throw new IllegalArgumentException("left strand must not be empty.");}
           if((rightStrand.length() == 0 || rightStrand.isEmpty())&&
              (leftStrand.length() != rightStrand.length())) {
              throw new IllegalArgumentException("right strand must not be empty."); 
           }
        
		for(int i = 0;i < leftStrand.length(); i++) {
			if( (leftStrand.charAt(i) != 'A' &&             
                 leftStrand.charAt(i) != 'C' &&
			    leftStrand.charAt(i) != 'G' && 
                 leftStrand.charAt(i) != 'T') ||
			    (rightStrand.charAt(i) != 'A' && 
                 rightStrand.charAt(i) != 'C' &&
			     rightStrand.charAt(i) != 'G' && 
                 rightStrand.charAt(i) != 'T' )) {
				throw new IllegalArgumentException("Invalid Input character");
				
			}
		}
		this.setLeftStrand(leftStrand);
		this.setRightStrand(rightStrand);
    }

    public int getHammingDistance() {
		int counter = 0;
		if(this.leftStrand.length() == 0 &&
           this.rightStrand.length() == 0) return 0;
			for(int i = 0; i< this.leftStrand.length(); i++) {
				if(this.leftStrand.charAt(i) != this.rightStrand.charAt(i)) {
					counter++;
				}
			}
		return counter;
    }

    	public String getLeftStrand() {
		return leftStrand;
	}
	public void setLeftStrand(String leftStrand) {
		this.leftStrand = leftStrand;
	}
	public String getRightStrand() {
		return rightStrand;
	}
	public void setRightStrand(String rightStrand) {
		this.rightStrand = rightStrand;
	}
}
