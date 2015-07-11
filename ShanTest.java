import com.alibaba.fastjson.JSONObject;

public class ShanTest {

    // private static String jsonStr = "" + "{" + "\"api\":\"2.1\"," + "\"message\":" + "[\"产品\",\"tokken\"]," +
    // "\"request\":{\"ptype\":\"JK\",\"tokken\":\"A#daDSFkiwi239sdls#dsd\"}," + "\"response\":{\"status\":" +
    // "{\"statusCode\":\"500\",\"statusMessage\":" + "[\"产品类型错误\",\"tokken失效\"]},"
    // + "\"page\":{\"pageSize\":\"100\",\"pageIndex\":\"1\"},\"data\":"
    // + "{\"ptitle\":\"all product lists\",\"sDate\":\"2014-12-01\",\"eDate\":\"2016-12-01\"," +
    // "\"productList\":[{\"pid\":\"RA001\",\"pname\":\"产品1\"},{\"pid\":\"RA002\",\"pname\":\"产品2\"}]}}," +
    // "\"args\":[{\"tit\":\"RA001\",\"val\":\"产品1\"},{\"tit\":\"RA002\",\"val\":\"产品2\"}]}";

    /*private static String jsonStr =
            "{\"agencyProductId\":\"11111\",\"planInfo\":[{\"planDateStr\":\"plan1,plan2\",\"datePriceList\":[{\"schemeIds\":\"aa,bb\",\"scheduleId\":\"bb\"}]}]}";
*/
    public static void main(String[] args) throws Exception {

        // date,scheme,value

        /*
         * String json =
         * "{\"agencyProductId\":\"11111\",\"planInfo\":[{\"planDateStr\":\"plan1\",\"datePriceList\":[{\"schemeIds\":\"aa\",\"scheduleId\":\"bb\"}]}]}"
         * ;
         */
        Object object = new Object();
        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(object);
        System.out.println(jsonObject);
        // JSONObject obj = JSON.parseObject(json);
        // JSONArray array = JSON.parseArray(obj.get("planInfo") + "");
        // List<PlanInfo> list = new
        // ArrayList<PlanInfo>();
        // for (int i = 0; i < array.size(); i++) {
        // PlanInfo planInfo = new PlanInfo();
        // JSONObject obj1 =
        // array.getJSONObject(i);
        // List<DatePriceList> listTemp = JSON.parseArray(obj1.get("datePriceList") + "", DatePriceList.class);
        // planInfo.setPlanDateStr(obj1.getString("planDateStr"));
        // planInfo.setDatePriceLists(listTemp);
        // list.add(planInfo);
        // }
        // System.out.println(list);

        // System.out.println(UUID.randomUUID().toString().replaceAll("-", "").toUpperCase());
        // System.out.println(getFormatDate(new Date(), "yyyyMMddHHmmssSSS"));
        /*
         * List<Multimap<String, String>> list = new ArrayList<Multimap<String, String>>(); Multimap<String, String> strMap =
         * ArrayListMultimap.create(); for (int i = 18; i < 20; i++) { strMap.put("amos", i + ""); } Multimap<String, String> strMap1 =
         * ArrayListMultimap.create(); for (int i = 15; i < 20; i++) { strMap1.put("amos", i + ""); } list.add(strMap); list.add(strMap1); JSONObject
         * jsonObject = JSON.parseObject(JSON.toJSONString(list.get(0).asMap())); System.out.println(jsonObject.toJSONString());
         */

        /*
         * Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2015-06-9"); System.out.println(DateUtils.isSameDay(date, new Date()));
         * System.out.println(date.after(new Date()));
         */

    }
}
