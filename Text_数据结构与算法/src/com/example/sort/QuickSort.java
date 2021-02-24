package com.example.sort;

public class QuickSort {
    public static void quickSort(long[]array){
        //排序的区间为lowIndex到highIndex
        quickSortInternal(array,0,array.length-1);
    }

    private static void quickSortInternal(long[]array,int lowIndex,int highIndex){
        //记录区间内数的个数
        //区间是[lowIndex,highIndex]
        int size=highIndex-lowIndex+1;
        //当区间内个数小于等于一时，区间有序
        if(size<=1){
            return;
        }

        //1.选择其中一个数出来（最左边）->array[lowIndex]
        //2.执行partition（分隔），小的数放左，大的数放右

        //keyIndex是经过partition后，选出来的数的最终下标
        int keyIndex=partitionHover(array,lowIndex,highIndex);

        //keyIndex左边： 左边的lowIndex=lowIndex，highIndex=keyIndex-1
        //keyIndex右边： 右边的lowIndex=keyIndex+1，highIndex=highIndex

        //分别左左右区间相同处理->递归
        quickSortInternal(array, lowIndex, keyIndex-1);
        quickSortInternal(array, keyIndex+1, highIndex);

    }
    //区间为array[lowIndex,highIndex]
    //1.选择array[lowIndex]作为特殊的数
    //2.需要遍历整个区间（不能遗漏任何数），与选择出来的数进行比较
    //3.保证小于等于的在最左边，大于等于的数在最右边（但没有顺序要求）
    private static int partitionHover(long []array,int lowIndex,int highIndex){
       int leftIndex=lowIndex;
       int rightIndex=highIndex;
       //选择的数是最左边的
        //注意：选择最左边的数key，要让rightIndex先动起来，不然右边全小于key的情况不好考虑
        long key=array[lowIndex];
        while (leftIndex<rightIndex){
            while (leftIndex<rightIndex&&array[rightIndex]>=key){
                //当右边的值大于key，rightIndex继续往左走
                rightIndex--;
            }
            while (leftIndex<rightIndex&&array[leftIndex]<=key){
                //当左边的值小于key，leftIndex继续往右走
                leftIndex++;
            }
            //当leftIndex和rightIndex都停下来时，交换
            swap(array, leftIndex, rightIndex);

            //当leftIndex和rightIndex相遇时，循环结束
        }
        //交换开始选中的值leftIndex和上述停止相遇的值lowIndex
        swap(array, leftIndex, lowIndex);

        //返回选中的key值当前的位置
        return leftIndex;

    }

    private static void swap(long[]array,int i,int j){
        long t=array[i];
        array[i]=array[j];
        array[j]=t;
    }

}
