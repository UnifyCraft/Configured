package xyz.unifycraft.configured.options.processor

import xyz.unifycraft.configured.Configurable
import xyz.unifycraft.configured.options.Option

object DslOptionProcessor : OptionProcessor {
    override fun process(configurable: Configurable) =
        configurable.options
}
