/*
88. �ϲ�������������
���������� �ǵݼ�˳�� ���е��������� nums1 �� nums2�������������� m �� n ���ֱ��ʾ nums1 �� nums2 �е�Ԫ����Ŀ��

���� �ϲ� nums2 �� nums1 �У�ʹ�ϲ��������ͬ���� �ǵݼ�˳�� ���С�

ע�⣺���գ��ϲ������鲻Ӧ�ɺ������أ����Ǵ洢������ nums1 �С�Ϊ��Ӧ�����������nums1 �ĳ�ʼ����Ϊ m + n������ǰ m ��Ԫ�ر�ʾӦ�ϲ���Ԫ�أ��� n ��Ԫ��Ϊ 0 ��Ӧ���ԡ�nums2 �ĳ���Ϊ n ��

 ��һ��ֱ�������������ϣ�֮��������
 ������˫ָ��ģ�����

 */




class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int newnumber = m + n;
        int[] newhight = new int[newnumber];
        int p1 = 0;
        int p2 = 0;
        int cur = 0;
        while(p1 < m||p2 < n){
            if(p1 == m ){
                cur = nums2[p2++];
            }else if(p2 == n){
                cur = nums1[p1++];
            }
            else if(nums1[p1] < nums2[p2]){
                cur = nums1[p1++];
            }
            else if(nums1[p1] >= nums2[p2]){
                cur = nums2[p2++];
            }
            newhight[p1+p2-1] = cur;
        }
        for(int i =0; i<m+n;i++){
            nums1[i] = newhight[i];
        }
    }
}