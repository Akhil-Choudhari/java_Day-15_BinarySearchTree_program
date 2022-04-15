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
public class MyBinaryTree<K extends Comparable<K>> {
	
	private MyBinaryNode<K> root;
	
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key){
		if (current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0) return current;
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
			else {
				current.right = addRecursively(current.right, key);
			}
				return current;
			}
		}
	}
}