package ink.ptms.adyeshach.core.entity.manager.event

import ink.ptms.adyeshach.core.entity.EntityInstance
import org.bukkit.entity.Player

/**
 * Adyeshach
 * ink.ptms.adyeshach.core.entity.manager.callback.DestroyEvent
 *
 * @author 坏黑
 * @since 2022/12/13 21:33
 */
class DestroyEvent(val entity: EntityInstance, val viewer: Player)