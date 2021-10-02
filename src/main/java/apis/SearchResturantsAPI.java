package apis;

public class SearchResturantsAPI {
    public static String getSearchApiUrl(String name){
     String UrlBasicSearch = "https://www.swiggy.com/dapi/restaurants/search/v2_2?lat=28.6862738&lng=77.2217831&trackingId=a6fd6353-41ec-1449-4977-9d781ad88a9c&str="+name+"&withMenuItems=true&sld=false&non_partner_search=false&submitAction=SUGGESTION&metadata=%7B%22type%22%3A%22suggestV1_tag_V1%22%2C%22data%22%3A%7B%22subType%22%3A%22DISH%22%2C%22vegIdentifier%22%3A%22NA%22%2C%22cloudinaryId%22%3A%22isaihr9c3lyyf7ml7opi%22%2C%22dishFamilyId%22%3A%22846647%22%7D%7D";
     return  UrlBasicSearch;
}
}