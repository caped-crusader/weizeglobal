// Generated code from Butter Knife. Do not modify!
package com.sourcey.materiallogindemo;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.jitsi.meet.R;

public class MenuActivity_ViewBinding implements Unbinder {
  private MenuActivity target;

  @UiThread
  public MenuActivity_ViewBinding(MenuActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MenuActivity_ViewBinding(MenuActivity target, View source) {
    this.target = target;

    target._conferenceButton = Utils.findRequiredViewAsType(source, R.id.btn_conf, "field '_conferenceButton'", Button.class);
    target._logoutButton = Utils.findRequiredViewAsType(source, R.id.btn_logout, "field '_logoutButton'", Button.class);
    target._profileButton = Utils.findRequiredViewAsType(source, R.id.btn_profile, "field '_profileButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MenuActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target._conferenceButton = null;
    target._logoutButton = null;
    target._profileButton = null;
  }
}
