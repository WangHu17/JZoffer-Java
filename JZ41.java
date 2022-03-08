import java.util.ArrayList;
//数据流中的中位数
public class Solution {
    
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public void Insert(Integer num) {
        if(list.size()==0){
            list.add(num);
            return;
        }
        int index = 0, i = 0;
        for(i=0; i<list.size(); i++){
            if(num <= list.get(i)){
                index = i;
                break;
            }
        }
        if(index == 0 && i!=0)index = i;
        list.add(index, num);
    }

    public Double GetMedian() {
        int len = list.size();
        if(len%2 == 1)return (double)list.get(len/2);
        else return (double)(list.get(len/2-1) + list.get(len/2))/2.00;
    }

}