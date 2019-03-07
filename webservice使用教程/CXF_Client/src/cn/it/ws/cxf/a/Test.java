package cn.it.ws.cxf.a;


public class Test {
  /**测试有CXF框架发布的webservice服务
   * 
   * @param args
   */
	public static void main(String[] args) {
		LanguageManager ws=new LanguageManager();
		LanguageService languageServicePort = ws.getLanguageServicePort();
		System.out.println(languageServicePort.getLanguage(1));
	}

}
