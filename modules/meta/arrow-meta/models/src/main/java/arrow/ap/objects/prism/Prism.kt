package arrow.ap.objects.prism

import arrow.core.Option
import arrow.optics.OpticsTarget
import arrow.optics.optics

@optics([OpticsTarget.PRISM])
sealed class Prism(val field: String, val nullable: String?, val option: Option<String>) {
  data class PrismSealed1(private val a: String?) : Prism("", a, Option.empty())
  data class PrismSealed2(private val b: String?) : Prism("", b, Option.empty())
  companion object
}
