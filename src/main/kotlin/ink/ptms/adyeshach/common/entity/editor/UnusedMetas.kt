package ink.ptms.adyeshach.common.entity.editor

import ink.ptms.adyeshach.common.entity.EntityInstance
import ink.ptms.adyeshach.common.entity.EntityMetaable
import ink.ptms.adyeshach.common.entity.Meta
import ink.ptms.adyeshach.common.entity.type.AdyArmorStand
import ink.ptms.adyeshach.common.entity.type.AdyBee
import ink.ptms.adyeshach.common.entity.type.AdyHuman
import kotlin.reflect.KClass

/**
 * Adyeshach
 * ink.ptms.adyeshach.common.editor.UnusedMetas
 *
 * @author sky
 * @since 2021/1/14 11:50 上午
 */
enum class UnusedMetas(val clazz: KClass<*>, val key: String) {

    ENTITY_1(EntityInstance::class, "unUsedRiding"),

    ENTITY_2(EntityInstance::class, "ticksFrozenInPowderedSnow"),

    ENTITY_3(EntityInstance::class, "isHandActive"),

    ENTITY_4(EntityInstance::class, "activeHand"),

    ENTITY_5(EntityInstance::class, "isSwimming"),

    BEE_1(AdyBee::class, "unUsed"),

    HUMAN_1(AdyHuman::class, "customName"),

    HUMAN_2(AdyHuman::class, "isCustomNameVisible"),

    ARMORSTAND_1(AdyArmorStand::class, "isSprinting"),

    ARMORSTAND_2(AdyArmorStand::class, "isSneaking"),

    ARMORSTAND_3(AdyArmorStand::class, "isInRiptideSpinAttack"),

    ;

    companion object {

        fun isUnusedMeta(entity: EntityMetaable, meta: Meta<*>): Boolean {
            return values().any { it.clazz.isInstance(entity) && it.key == meta.key }
        }
    }
}