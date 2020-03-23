package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
   var arr4=sadArray.filterIndexed { index, i -> index==0 || index==sadArray.size-1|| sadArray[index+1]+sadArray[index-1] > sadArray[index] }.toIntArray()
        var arr5=arr4.filterIndexed { index, i -> index==0 || index==arr4.size-1|| arr4[index+1]+arr4[index-1] > arr4[index] }.toIntArray()
        var arr6=arr5.filterIndexed { index, i -> index==0 || index==arr5.size-1|| arr5[index+1]+arr5[index-1] > arr5[index] }.toIntArray()
return  arr6
    }
}
