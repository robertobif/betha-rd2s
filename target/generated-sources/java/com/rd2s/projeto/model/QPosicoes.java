package com.rd2s.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPosicoes is a Querydsl query type for Posicoes
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPosicoes extends EntityPathBase<Posicoes> {

    private static final long serialVersionUID = 764835533L;

    public static final QPosicoes posicoes = new QPosicoes("posicoes");

    public final com.rd2s.projeto.enterprise.QAbstractEntity _super = new com.rd2s.projeto.enterprise.QAbstractEntity(this);

    public final StringPath descricao = createString("descricao");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final EnumPath<SiglaPosicoes> sigla_pos = createEnum("sigla_pos", SiglaPosicoes.class);

    public QPosicoes(String variable) {
        super(Posicoes.class, forVariable(variable));
    }

    public QPosicoes(Path<? extends Posicoes> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPosicoes(PathMetadata metadata) {
        super(Posicoes.class, metadata);
    }

}

