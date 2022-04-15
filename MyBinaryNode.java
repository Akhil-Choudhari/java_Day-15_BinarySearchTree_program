package BinarySearchTree;

public class MyBinaryNode<K extends Comparable<K>> {
	K key;
	MyBinaryNode<K> left;
	MyBinaryNode<K> rigth;
	
	public MyBinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.rigth = null;
		
	}

}

public class MyBinaryTreeTest {
	@Test
	public void given3NumberWhenAddedToBSTShouldReturnSize3() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		Assert.assertEquals( expected: 3, size);
	}
	
}