package neutron

class Vector {
    var x:Number? = null
    var y:Number? = null
    var z:Number? = null
    constructor() {}

    constructor(x: Number?, y: Number?, z: Number?) {
        this.x = x
        this.y = y
        this.z = z
    }
    operator fun minus(other:Vector):Vector = Vector(
        (this.x)?.toDouble()?.minus(other.x?.toDouble()!!),
        (this.y)?.toDouble()?.minus(other.y?.toDouble()!!),
        (this.z)?.toDouble()?.minus(other.z?.toDouble()!!))
    operator fun plus(other:Vector):Vector = Vector(
        (this.x)?.toDouble()?.plus(other.x?.toDouble()!!),
        (this.y)?.toDouble()?.plus(other.y?.toDouble()!!),
        (this.z)?.toDouble()?.plus(other.z?.toDouble()!!))
    operator fun rem(other:Vector):Vector = Vector(
        (this.x)?.toDouble()?.rem(other.x?.toDouble()!!),
        (this.y)?.toDouble()?.rem(other.y?.toDouble()!!),
        (this.z)?.toDouble()?.rem(other.z?.toDouble()!!))

    override operator fun equals(other: Any?): Boolean = this === other

    operator fun unaryPlus() {
        this.x = +this.x?.toDouble()!!
        this.y = +this.y?.toDouble()!!
        this.z = +this.z?.toDouble()!!
    }
    operator fun unaryMinus() {
        this.x = -this.x?.toDouble()!!
        this.y = -this.y?.toDouble()!!
        this.z = -this.z?.toDouble()!!
    }

    fun toIntArray():Array<Int?> = arrayOf(this.x?.toInt(),this.y?.toInt(),this.z?.toInt())
    fun toDoubleArray():Array<Double?> = arrayOf(this.x?.toDouble(),this.y?.toDouble(),this.z?.toDouble())
    fun toFloatArray():Array<Float?> = arrayOf(this.x?.toFloat(),this.y?.toFloat(),this.z?.toFloat())
    fun toStringArray():Array<String?> = arrayOf(this.x?.toString(),this.y?.toString(),this.z?.toString())

    override fun toString(): String = "${this.x},${this.y},${this.z}"
    override fun hashCode(): Int {
        var result = x?.hashCode() ?: 0
        result = 31 * result + (y?.hashCode() ?: 0)
        result = 31 * result + (z?.hashCode() ?: 0)
        return result
    }
}
