package unit2;
		public class GarbageDemo {
			String label;
			GarbageDemo(){
				this.label="Default";
			}
			GarbageDemo(String l){
				this.label = l;
			}
			void display() {
				System.out.println("Display method " + label);
			}
			protected void finalize() throws Throwable {
				System.out.println("in finalize");
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				GarbageDemo gd1 = new GarbageDemo();
				gd1.display();
				gd1= null;		//eligible for garbage collection
				System.gc();
						
				GarbageDemo gd2 = new GarbageDemo("object 2");
				gd2.display();
				
				//eligible for garbage collection
				new GarbageDemo("object 3").display();
				
				gd2 = new GarbageDemo("object 4");
				gd2.display();
				gd2 = null;
				System.gc();
				
				System.out.println("Exiting main method.");
			}
}
