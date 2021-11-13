package com.rd2s.projeto.enterprise;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAbstractRegion is a Querydsl query type for AbstractRegion
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QAbstractRegion extends EntityPathBase<AbstractRegion> {

    private static final long serialVersionUID = -2072020726L;

    public static final QAbstractRegion abstractRegion = new QAbstractRegion("abstractRegion");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath nome = createString("nome");

    public final StringPath populacao = createString("populacao");

    public QAbstractRegion(String variable) {
        super(AbstractRegion.class, forVariable(variable));
    }

    public QAbstractRegion(Path<? extends AbstractRegion> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAbstractRegion(PathMetadata metadata) {
        super(AbstractRegion.class, metadata);
    }

}

