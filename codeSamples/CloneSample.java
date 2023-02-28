public class CloneSample implements Cloneable{
	int i;
	int j = 55;
	
	public CloneSample clone(){
        try {
            return (CloneSample) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    
    public boolean equals(CloneSample obj) {
        if (i == obj.i && j == obj.j)
            return true;
        else
            return false;
    }
    
    public static void main(String args[]) {
        CloneSample obj1 = new CloneSample();
        obj1.i = 5;
        obj1.j = 69;
        
        
        CloneSample obj2 = obj1.clone();
		System.out.printf("i: %d, j: %d \n",obj2.i,obj2.j);
        System.out.println(obj1);
        System.out.println(obj2);
        
        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
   
	}
}