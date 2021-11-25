package arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import bsh.Capabilities;

public class Sort_Array_List {
	public static void main(String[] args) {
		WebDriver driver;
		DesiredCapabilities des=new DesiredCapabilities();
		des.getBrowserName();
		
		int a[]= {25,30,-25,-77,12,5,8};
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				int sort=0;


				if(a[i]<a[j]) {
					sort=a[i];
					a[i]=a[j];
					a[j]=sort;
					
				} 
			}
			
		}
		for(int k=0;k<a.length;k++) {
			
			System.out.println(a[k]);
		}
		
		int b[]= {25,30,-25,-77,12,5,8};
		for(int i=0;i<b.length;i++) {
			
			for(int j=i+1;j<b.length;j++) {
				int sort=0;


				if(b[i]>b[j]) {
					sort=b[i];
					b[i]=b[j];
					b[j]=sort;
					
				}
			}
			
		}
		for(int k=0;k<b.length;k++) {
			
			System.out.println(b[k]);
		}
	}

}
