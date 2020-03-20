package subtask2
var min = 0
var max=0

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        min = input.min()?: 0
        max=input.max()?: 0
        return arrayOf(input.sum()-max, input.sum()-min).toIntArray()
    }
}
