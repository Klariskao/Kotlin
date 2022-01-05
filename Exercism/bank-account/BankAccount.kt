import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger

class BankAccount {
    var aBalance = AtomicInteger(0)
    val balance: Int
        get() { check(isOpen.get())
            return aBalance.get() }

    private var isOpen = AtomicBoolean(true)

    fun adjustBalance(value: Int) {
        check(isOpen.get())
        aBalance.addAndGet(value)
    }

    fun close() {
        isOpen.set(false)
    }
}