class break_label{
	public static void main(String a[]){
		boolean b=true;
		first:{
		    second:{
		        third:{
		        	System.out.println("Before Break");
			if(b){break second;}
			System.out.println("This won't execute.");
		        }
		        System.out.println("This won't execute.");
		    }
		    System.out.println("After Second Block.");
		}
	}
}