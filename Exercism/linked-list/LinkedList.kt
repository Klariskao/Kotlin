class Deque<T> {

    var head:Node? = null
    var tail:Node? = null

    inner class Node(var value: T){
        var prev: Node? = null
        var next:Node? = null
    }

    fun push(value: T) {
        val newNode = Node(value)
        newNode.prev = tail
        tail?.next = newNode
        tail = newNode
        if (head == null) head = newNode
    }

    fun pop(): T? {
        if (tail == null) tail = head
        val item = tail?.value
        tail = tail?.prev
        return item!!
    }

    fun unshift(value: T) {
        val newNode = Node(value)
        newNode.next = head
        head = newNode
        if (tail == null) tail = newNode
    }

    fun shift(): T? {
        val item = head?.value
        head = head?.next
        return item!!
    }
}