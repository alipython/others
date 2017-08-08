/* *************************************
*
* @Author         Noxaean
* @Email          noxaean@gmail.com
* @Description  
* @Created        2017-08-08 18:59:53
* @Last Modified  2017-08-08 20:06:23
*
* ****************************************/


public class SkipWraper{

    public SkipWraper(Method method, isSkipExpected){
	this.method = method;
	this.isSkipExpected =isSkipExpected;
    }
    private boolean isSkipExpected = false;
    private Method method;

    public void invoke(Object obj, Class<?>... parameter){
	try{
		method.invoke

		assertTrue("Test did not match expected", !isSkipExpected);
	}catch (InvockeException e){
	    if( e.getMainExcpetion() instanceof SkipException){
	    assertTrue("TestCase Skipped, not meet expect.", isSKipExpected);
	    }else{
		assertTrue("Un expected Exception occured", false);
	}
    }

public static int main(){
    boolean isSkip = true;
    Method method = new Method(); 
    (new SkipWraper(method, isSkip)).invok(rbs,xxxxxx);
}


