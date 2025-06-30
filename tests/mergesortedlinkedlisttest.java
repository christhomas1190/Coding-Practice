import mergedsortedlinkedlist.ListNode;
import mergedsortedlinkedlist.SortedMergeSolution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class mergesortedlinkedlisttest {

    private SortedMergeSolution sortedMergeSolution;

    @BeforeEach
    void setup (){
        sortedMergeSolution=new SortedMergeSolution();
    }
    @Test
    void testMergeTwoSortedLists() {
        // Given: Two sorted linked lists
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        // When: Merging the two lists
        ListNode result = sortedMergeSolution.mergeTwoLists(list1, list2);

        // Then: The result should be a sorted list containing all elements
        int[] expected = {1, 2, 3, 4, 5, 6};
        int i = 0;
        while (result != null) {
            assertEquals(expected[i], result.val);
            result = result.next;
            i++;
        }

        // And: The length should match the expected array
        assertEquals(expected.length, i);
    }
    @Test
    void oneEmptyListNode(){
        // Given: Two sorted linked lists

        ListNode list1 = null;
        ListNode list2 = null;

        // When: Merging the two lists

        ListNode results = sortedMergeSolution.mergeTwoLists(list1,list1);
        // Then: The result should be a sorted list containing all elements
        assertNull(results);
    }

}
