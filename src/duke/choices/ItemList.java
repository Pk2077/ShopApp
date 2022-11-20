/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choices;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;
import java.util.concurrent.CompletionStage;
/**
 *
 * @author theassembler
 */
public class ItemList implements Handler{

    public ItemList(Clothing[] items) {
        this.items=items;
    }
    private Clothing[] items;

    @Override
    public void accept (ServerRequest req , ServerResponse res){
    res.status(Http.Status.OK_200);
    res.headers().put("Content-Type","text/plain; charset=UTF-8");
    StringBuilder result= new StringBuilder();
    for (Clothing item : items){
    result.append(item +"\n");
    }
    res.send(result);
    }
    
}
