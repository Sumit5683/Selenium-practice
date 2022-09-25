package TestNG;

import org.testng.annotations.Test;
@Test(groups="user-registration")
public class E_TestGroups {
		
		@Test(priority=1,groups="regression")
		public void test1() {
			System.out.println("test 1");
		}
		
		@Test(priority=2,groups="regression")
		public void Test2() {
			System.out.println("test 2");
		}
		
		@Test(groups={"regression","bvt"})
		public void Test3() {
			System.out.println("test 3");
		}
		
		@Test(groups="bvt")
		public void Test4() {
			System.out.println("test 4");
		}
		

	

}
