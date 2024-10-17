package Trees;

import javax.swing.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class HtmlTree {
    public static void main(String[] args) {
        // Create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("html");

        // Create the child nodes
        DefaultMutableTreeNode head = new DefaultMutableTreeNode("head");
        DefaultMutableTreeNode body = new DefaultMutableTreeNode("body");
        
        DefaultMutableTreeNode meta = new DefaultMutableTreeNode("meta");
        DefaultMutableTreeNode title = new DefaultMutableTreeNode("title");
        
        DefaultMutableTreeNode ul = new DefaultMutableTreeNode("ul");
        DefaultMutableTreeNode li1 = new DefaultMutableTreeNode("li");
        DefaultMutableTreeNode li2 = new DefaultMutableTreeNode("li");
        
        DefaultMutableTreeNode h1 = new DefaultMutableTreeNode("h1");
        DefaultMutableTreeNode h2 = new DefaultMutableTreeNode("h2");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("a");

        // Build the tree structure
        root.add(head);
        root.add(body);
        
        head.add(meta);
        head.add(title);
        
        body.add(ul);
        ul.add(li1);
        ul.add(li2);
        
        body.add(h1);
        body.add(h2);
        h2.add(a);

        // Create the tree by passing the root node
        JTree tree = new JTree(root);

        // Create and set up the window
        JFrame frame = new JFrame("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Add the tree to a scroll pane and add it to the frame
        frame.add(new JScrollPane(tree));
        frame.setVisible(true);
    }
}
