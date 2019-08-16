
public class primeSum {

	public static void main(String args[]) {	
		int inputArray[]={2, 4, 6, 11, 12, 18, 7,13,23};
		int j=0;
		int outputArray[]=new int[inputArray.length];
		for(int i=0;i<inputArray.length;i++) {
			if(isPrime(inputArray[i])) {
				if(isPrimeDigit(inputArray[i])) {
					outputArray[j]=inputArray[i];
					j++;
			}
				//System.out.println(inputArray[i]);
			}
		}
		
		for(int i=0;i<j;i++) {
			System.out.println(outputArray[i]);
		}
		
	}

	private static boolean isPrimeDigit(int n) {
		// TODO Auto-generated method stub
		int sum=0,i;
		while(n!=0) {
			i=n%10;
			sum=sum+i;
			n=n/10;
		}
		if(isPrime(sum)) {
			return true;
		}
		return false;
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
			
		}
		
		
		return true;
	}
}
