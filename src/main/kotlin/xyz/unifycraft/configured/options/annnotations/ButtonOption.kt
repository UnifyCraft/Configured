package xyz.unifycraft.configured.options.annnotations

import xyz.unifycraft.configured.options.Option

@Target(AnnotationTarget.FUNCTION)
annotation class ButtonOption(
    /**
     * The serializable name of the option,
     * and the default if the localized
     * name is blank.
     */
    val name: String,
    /**
     * The localized name of the option.
     */
    val localizedName: String = "",
    /**
     * The description of the option.
     */
    val description: String = "",
    /**
     * Whether the option is hidden
     * from the user.
     */
    val hidden: Boolean = Option.DEFAULT_HIDDEN,
    /**
     * The tags that can be used to
     * search for the option in the
     * default UI.
     */
    val tags: Array<String> = [],
    /**
     * The text shown on the
     * button.
     */
    val text: String = "",
)
