package com.leo.han.junit;

import java.lang.reflect.Method;

public class JunitFramework {

	public static void junitParse(Class targetObject) {

		if (targetObject.isAnnotationPresent(TestInfo.class)) {

			TestInfo testInfo = (TestInfo) targetObject
					.getAnnotation(TestInfo.class);

			StringBuffer sb = new StringBuffer();

			sb.append(testInfo.priority()).append("\n\n")
					.append(testInfo.revision()).append("\n\n")
					.append(testInfo.createdBy()).append("\n\n")
					.append(testInfo.createdDate()).append("\n\n");
			
			for(Method method: targetObject.getMethods()){
				
				if(method.isAnnotationPresent(Test.class)){
					
					sb.append("[Method Name:  " + method.getName() + "]" );
					
					Test test = (Test)method.getAnnotation(Test.class);
					
					if(test.enabled()){
						
						try {
							
						
							
							method.invoke(targetObject.newInstance());
							sb.append("[test enabled]  [test passed] \n\n");
							
						} catch (Exception e) {
							sb.append("[test enabled]  [test failed] \n\n");
						}
						
					}else{
						sb.append("[test disabled]  \n\n");
					}
					
					
				}
				
			}
			
			System.out.println(sb.toString());

		}

	}

}
