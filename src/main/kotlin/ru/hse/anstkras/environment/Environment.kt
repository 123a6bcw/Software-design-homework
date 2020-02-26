package ru.hse.anstkras.environment

import java.nio.file.Path
import java.nio.file.Paths

/** Environment holds environment state, for example, environment variables AND current position in file system */
class Environment {
    private val environmentMap = HashMap<String, String>()
    private var currentPath = Paths.get("/")

    init {
        environmentMap["?"] = "0"
    }

    constructor()

    constructor(currentPath: Path) {
        this.currentPath = currentPath
    }

    /** Sets the given value for the given variable */
    fun setValue(variable: String, value: String) {
        environmentMap[variable] = value
    }

    /** Gets the value for the given variable */
    fun getValue(variable: String): String {
        return environmentMap.getOrDefault(variable, "")
    }

    /**
     * If anotherPath is absolute, change the current path in the environment to anotherPath. Otherwise, combine them
     *
     * @see Path.resolve
     */
    fun enterPath(anotherPath: String): Boolean {
        val result = currentPath.resolve(anotherPath)
        if (!result.toFile().exists()) {
            return false
        }

        currentPath = result
        return true
    }

    /**
     * Get current environment path
     */
    fun getPath(): Path {
        return currentPath
    }

    /**
     * Get path relative to the current environment path. If path is absolute, returns it, otherwise enters combine two paths.
     *
     * @see Path.resolve
     */
    fun getPath(anotherPath: Path): Path {
        //TODO check if ploho
        return currentPath.resolve(anotherPath)
    }

    /**
     * @see getPath(Path)
     */
    fun getPath(anotherPath: String): Path {
        //TODO check if ploho
        return currentPath.resolve(anotherPath)
    }
}
