import { Component } from '@angular/core';
import { Player } from '@app/model/player';
import { PlayerService } from '@app/services/player.service';

@Component({
  selector: 'app-addplayer',
  templateUrl: './addplayer.component.html',
  styleUrl: './addplayer.component.css'
})
export class AddplayerComponent {

  constructor(private playerService: PlayerService) {}

  insertPlayer(formData: Player): void {
    this.playerService.insert(formData)
      .subscribe(
        (player) => {
          console.log('Added Player is: ', player);
        },
        (error) => {
          console.error('Error adding player:', error);
        }
      );
  }
}
