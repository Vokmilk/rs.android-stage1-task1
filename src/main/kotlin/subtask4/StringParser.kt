package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
 
    var substr1: String =inputStr
    var substr2: String = inputStr

    fun getString(string: String): Array<String>{
        var closeChar: String
        var closeIndex: Int
        var openChar: String
        var openIndex: Int
        var open1 = 0
        var open2 = 0
        var open3 = 0
        var substr3: String
        if (string.indexOf("[")>0) open1 =  string.indexOf("[") else open1 =999999
        if (string.indexOf("<")>0) open2 =  string.indexOf("<") else open2 =999999
        if (string.indexOf("(")>0) open3 =  string.indexOf("(") else open3 =999999

        openChar= when  {
            open1<open2-> {
                when {
                    open1<open3 -> "["
                    else -> "("
                }
            }
            open2<open3 -> "<"
            else -> "("
        }// нашли открывающий
        closeChar = when (openChar){
            "[" ->  "]"
            "<" -> ">"
            "(" -> ")"
            else -> "Finish"
        } //нашли закрывающий элемент

        openIndex=string.indexOf(openChar)
        closeIndex =string.indexOf(closeChar)
        substr1=string.substring(openIndex+1 until closeIndex)
        substr2= string.substring(closeIndex+1..string.lastIndex)
        if( substr2.length>1) substr3= substr1+" "+getString(substr2) else substr3 = substr1
                return substr3.split(" ").toTypedArray()
    }
    }
}
