
import java.lang.String;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException {

		
		
		String url = "https://www.saramin.co.kr/zf_user/jobs/list/job-category?cat_mcls=2&panel_type=&search_optional_item=n&search_done=y&panel_count=y&preview=y&page=20";
		Document doc = Jsoup.connect(url).get();
		
		Elements element = doc.select(".str_tit");
		
		for(Element e:element) {
			System.out.println(e.attr("title"));
		}
	}

}

