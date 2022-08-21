package lab4;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Exercise1 {

    private static final int MAX_PAGES_TO_SEARCH = 26;
    private Set<String> pagesVisited = new HashSet<String>();
    private List<String> pagesToVisit = new LinkedList<String>();
    private List<String> emails = new LinkedList<>();

private String nextUrl()
{
    String nextUrl;
    do
    {
        nextUrl = this.pagesToVisit.remove(0);
    } while(this.pagesVisited.contains(nextUrl));
    this.pagesVisited.add(nextUrl);
    return nextUrl;
}

public void search(String url, String searchWord)
{
    while(this.pagesVisited.size() < MAX_PAGES_TO_SEARCH)
    {
        String currentUrl;
        SpiderLeg leg = new SpiderLeg();
        if(this.pagesToVisit.isEmpty())
        {
            currentUrl = url;
            this.pagesVisited.add(url);
        }
        else
        {
            currentUrl = this.nextUrl();
        }
        leg.crawl(currentUrl); // Lots of stuff happening here. Look at the crawl method in
        // SpiderLeg
        leg.searchForWord(currentUrl, emails);
        this.pagesToVisit.addAll(leg.getLinks());
        this.pagesToVisit.addAll(leg.getLinks());
    }
    System.out.println(emails.toString());
    //System.out.println(String.format("**Done** Visited %s web page(s)", this.pagesVisited.size()));
}