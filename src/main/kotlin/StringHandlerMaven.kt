import com.google.gson.Gson
import java.util.*



fun main(){
    val jsonString = "{\"fields\":{\"project\":{\"key\":\"TEST\"},\"summary\":\"REST ye merry gentlemen.\",\"description\":\"Creating of an issue using project keys and issue type names using the REST API\",\"issuetype\":{\"name\":\"Bug\"},\"customField_21422\":\"HYKUOP\",\"customField_21424\":\"\"}}"
//    var map: Map<String, Any> = HashMap()
    val map = Gson().fromJson(jsonString, JiraTicker::class.java)
    map.fields.reporter = map.fields.customField_21422
    System.out.print(Gson().toJson(map))
}