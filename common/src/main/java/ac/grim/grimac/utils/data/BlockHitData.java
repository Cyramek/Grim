package ac.grim.grimac.utils.data;

import ac.grim.grimac.utils.math.Vector3dm;
import com.github.retrooper.packetevents.protocol.world.BlockFace;
import com.github.retrooper.packetevents.protocol.world.states.WrappedBlockState;
import com.github.retrooper.packetevents.util.Vector3d;
import com.github.retrooper.packetevents.util.Vector3i;
import lombok.ToString;

@ToString
public class BlockHitData extends HitData {
    Vector3i position;
    WrappedBlockState state;
    BlockFace closestDirection;

    public BlockHitData(Vector3i position, Vector3dm blockHitLocation, BlockFace closestDirection, WrappedBlockState state) {
        super(blockHitLocation);
        this.position = position;
        this.closestDirection = closestDirection;
        this.state = state;
    }

    public Vector3i position() {
        return this.position;
    }

    public WrappedBlockState state() {
        return this.state;
    }

    public BlockFace closestDirection() {
        return this.closestDirection;
    }

    public Vector3d getRelativeBlockHitLocation() {
        return new Vector3d(blockHitLocation.getX() - position.getX(), blockHitLocation.getY() - position.getY(), blockHitLocation.getZ() - position.getZ());
    }

}
