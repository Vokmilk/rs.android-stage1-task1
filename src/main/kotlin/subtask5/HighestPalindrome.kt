package subtask5

class HighestPalindrome {
    var nine  = 57.toChar()
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var count: Int =0
        var arr = digitString.toMutableList()
        for (i in 0..n/2-1) {
            if (digitString[i].toInt()!= digitString[n-1-i].toInt()){
                count +=1
            }
            else {
            }
        }
        if (count > k && k!=count){
            return "-1"
        }
        else if (count==1 ||  k==1){
            for (i in 0..n/2) {
                if (digitString[i] == digitString[n-1-i]){
                }
                else if (digitString[i] > digitString[n-1-i]){
                    arr[n-1-i]=arr[i]
                }
                else arr[i]=arr[n-1-i]
            }
            return arr.joinToString(separator="")
        }
        else{
            arr.set(0,nine)
            arr.set(arr.lastIndex,nine)

            return  highestValuePalindrome(n, k-2,arr.joinToString(separator=""))
        }


    }

}
