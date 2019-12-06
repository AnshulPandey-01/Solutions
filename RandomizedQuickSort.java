import java.util.Random;

//Quick Sort: It picks pivot and divide the elements around the pivot and sort the array recursively.
//Time Complexity: O(n*log(n))

class QuickSort{
    //random number between range
    int random(int low,int high){ 
        Random rand= new Random();
        int pivot = rand.nextInt(high-low+1) + low;
        return pivot;
    }
    private int partion(int a[], int l, int r){
        int p = random(l, r);
        //creating pivot and swaping it with lower bound
        int pivot = a[p];
        a[p] = a[l];
        a[l] = pivot;
        //variable k to store upper bound of lower elemnts than pivot
        int k = l;
        for(int i = l+1; i<=r; i++){
            if(a[i]<=pivot){
                k++;
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
        //swaping pivot/lower bound to its right position
        int temp = a[k];
        a[k] = a[l];
        a[l] = temp;
        return k;
    }
    void sort(int a[], int l, int r){
        if(l>=r) return;
        int m = partion(a, l, r);
        sort(a, l, m-1);
        sort(a, m+1, r);
    }
    void print(int a[]){
        for(int i : a){
            System.out.println(i);
        }
    }
    public static void main(String[ ] args){
        int arr[] = {12, 10, 7, 8, 2, 9, 6, 1, 11, 5};
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, arr.length-1);
        ob.print(arr);
    }
}
