class lab2 {

	public static void main(String[] args) {
// here array is show
    int arr[]={10,5,7,19,20};
    int largest=arr[0];
    int secondlargest=arr[0];
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]>largest)
    	{
    		secondlargest=largest;
    		largest=arr[i];
// this is comment line
    	/// ballu is java deee	
    	}
    }
    System.out.println("the second largest no. is...:"+secondlargest);
	}

}
