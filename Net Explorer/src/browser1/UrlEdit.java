package browser1;

public class UrlEdit {

    public String urlEdit(String userText) 
    {
        userText = userText.trim();
        String st = "";
        int String_length = userText.length();
        
        if (userText.charAt(0) == 'w' && userText.charAt(1) == 'w' && userText.charAt(2) == 'w' && userText.charAt(3) == '.') 
        {
            st = "https://";
            st += userText;
        } 
        else if(userText.charAt(String_length-4) == '.' && userText.charAt(String_length-3) == 'c' &&
                userText.charAt(String_length-2) == 'o' && userText.charAt(String_length-1) == 'm' )
        {
            st = "https://www.";
            st += userText;
        }
        else if(userText.charAt(String_length-4) == '.' && userText.charAt(String_length-3) == 'e' &&
                userText.charAt(String_length-2) == 'd' && userText.charAt(String_length-1) == 'u' )
        {
            st = "https://www.";
            st += userText;
        }
        else {
            st = "https://www.bing.com/search?q=";
            st += userText;
        }
        return st;
    }
}

/*
https://www.bing.com/search?q=youtube&form=QBLH&sp=-1&pq=youtube&sc=8-7&qs=n&sk=&cvid=994D03584E734EB2AEA90BE810A28BF5
https://www.bing.com/search?q=messi&qs=n&form=QBRE&sp=-1&pq=messi&sc=9-5&sk=&cvid=3FEA756851854FD49BEAA80BCE930367


https://www.bing.com/search?q=youtube&qs=n&form=QBRE&sp=-1&pq=youtube&sc=9-7&sk=&cvid=AFB6D1EDC4B14547A286642FA5A0A5AA

Search messi in bing 
Search bar: https://www.bing.com/search?q=messi&form=ANNTH1&refig=9b495aa2aa49419cba68629c096d9189&sp=-1&pq=messi&sc=9-5&qs=n&sk=&cvid=9b495aa2aa49419cba68629c096d9189
Upper bar: https://www.bing.com/search?q=messi&cvid=8702689b15e64a109219fa54bfd1e7e8&aqs=edge.0.69i59l2j0l5.1290j0j1&pglt=771&FORM=ANNTA1&PC=U531

Normal search in bing

https://www.bing.com/search?q=youtube&qs=n&form=QBRE&sp=-1&pq=youtube&sc=9-7&sk=&cvid=2907A84938DF404B945E325D9683B34E
https://www.bing.com/search?q=youtube&qs=n&form=QBRE&sp=-1&pq=youtube&sc=9-7&sk=&cvid=AFB6D1EDC4B14547A286642FA5A0A5AA

Search bar in google
https://www.google.com/search?q=youtube&oq=youtube&aqs=edge.0.69i59j69i60l3j0i273l3.2850j0j4&sourceid=chrome&ie=UTF-8
https://www.google.com/search?q=youtube&oq=youtube&aqs=edge.0.69i59j69i60l5j0i273.2181j0j1&sourceid=chrome&ie=UTF-8

*/